package net.coderbot.iris.gui.property;

import net.coderbot.iris.gui.GuiUtil;
import net.coderbot.iris.gui.element.PropertyDocumentWidget;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.Properties;

public class StringOptionProperty extends OptionProperty<String> {
    public StringOptionProperty(String[] values, int defaultIndex, PropertyDocumentWidget document, String key, Text label, boolean isSlider) {
        super(values, defaultIndex, document, key, label, isSlider);
    }

    @Override
    public Text createValueText(int width) {
        return GuiUtil.trimmed(MinecraftClient.getInstance().textRenderer, getValue(), width, false, true, isDefault() ? Formatting.RESET : Formatting.YELLOW);
    }

    @Override
    public void read(Properties properties) {
        if(properties.containsKey(key)) {
            this.setValue(properties.getProperty(key));
            return;
        }
        this.index = defaultIndex;
    }
}