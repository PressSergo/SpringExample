package allFile;

public class SuddenlyOracul implements Oracul {
    private Encyclopedia encyclopedia;

    public void setEncyclopedia(Encyclopedia encyclopedia) {
        this.encyclopedia = encyclopedia;
    }

    @Override
    public void defineMeaningOLife() {
        System.out.println("Oracul leave: "+encyclopedia.getMessage());
    }
}
