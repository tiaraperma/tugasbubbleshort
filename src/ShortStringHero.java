public class ShortStringHero {
    private String[] hero;
    public ShortStringHero(){
    }


    public String[] getHero() {
        return hero;
    }
    public void setHero(String[] hero) {
        this.hero = hero;
    }
    public void sortData(){

        for (int i = 0;i<this.hero.length;i++){
            for (int j=i+1;j<this.hero.length;j++){
                if(this.hero[j].compareToIgnoreCase(this.hero[i]) > 0) {
                    String temp = this.hero[i];
                    this.hero[i] = this.hero[j];
                    this.hero[j] = temp;
                }
            }
        }
    }
    public void PrintData(){
        for (String listhero : this.hero){
            System.out.println(listhero+" ");
        }
    }

    public static void main(String[] args) {
        String[] superhero = {"hulk","ironman","Batman", "Wonderwoman", "spiderman"};
        ShortStringHero sort = new ShortStringHero();
        sort.setHero(superhero);
        sort.sortData();
        sort.PrintData();
    }
}
