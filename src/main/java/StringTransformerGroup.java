import java.util.List;

public class StringTransformerGroup implements StringTransformer {
    private List<StringTransformer> transformers;

    public StringTransformerGroup(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    @Override
    public void execute(StringDrink drink) {
        for (StringTransformer transformer : transformers) {
            transformer.execute(drink);
        }
    }

    @Override
    public void undo(StringDrink drink) {
        for (int i = transformers.size() - 1; i >= 0; i--) {
            transformers.get(i).undo(drink);
        }
    }
}

