public class Printer {

    private int sheets;
    public int pages;
    public int copies;
    public int toner;


    public Printer(int sheets, int pages, int copies, int toner){
        this.sheets = sheets;
        this.pages = pages;
        this.copies = copies;
        this.toner = toner;
    }

    public int getSheets() {
        return sheets;
    }

    public int getPages() {
        return pages;
    }

    public int getCopies(){
        return copies;
    }

    public int refill() {
        if (sheets < 1000) {
            sheets = 1000;
        }
        return sheets;
    }

    public int getToner() {
        return toner;
    }

    public int pagesUsed() {
        if ((pages * copies)<= sheets){
            sheets -= (pages * copies);
        }
        return sheets;
    }

    public boolean lowPaper() {
        if ((pages * copies)>= sheets){
            return false;
        }
        return true;
    }


    public int decreaseToner() {
        toner -= (pages * copies);
        return toner;
    }
}
