public class Copier {

    private int paper;
    private boolean paperJam;

    public Copier(int paper){
      this.paper=paper;

      paperJam = false;
    }

    public void InsertPaper(int paper) {
        if (paper + this.paper > 500) {
            System.out.println("Fejl, der er ikke plads til mere papir");

        } else {
            this.paper = paper + this.paper;
        }
    }
    public int getPaper(){
        return paper;

    }

    public void makeCopy(int copies){
        if (paperJam){
            System.out.println("Papir er stuck");
        }
        else if (paper-copies<0){
            System.out.println("Fejl, der er ikke nok papir");
        }
        else {
            paper=paper-copies;
        }


    }
    public void makePaperJam(){
        paperJam = true;


    }
    public void fixJam(){
        paperJam = true;
    }
}
