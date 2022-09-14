public class Main {

    public static void main(String[] args) {
        Copier kopiMaskine = new Copier(191);
        kopiMaskine.InsertPaper(0);
        System.out.println(kopiMaskine.getPaper());
        kopiMaskine.makeCopy(8);
        System.out.println(kopiMaskine.getPaper());
        kopiMaskine.makePaperJam();

    }
}
