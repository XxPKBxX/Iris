package net.coderbot.iris.gui.property;

import net.coderbot.iris.gui.element.PropertyDocumentWidget;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class StringOptionProperty extends OptionProperty<String> {
    public StringOptionProperty(String[] values, int defaultIndex, PropertyDocumentWidget document, String key, Text label) {
        super(values, defaultIndex, document, key, label);
    }

    @Override
    public Text getValueText() {
        return isDefault() ? new LiteralText(this.getValue()) : new LiteralText(this.getValue()).formatted(Formatting.YELLOW);
    }
}