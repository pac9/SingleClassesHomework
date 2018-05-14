public class WaterBottle {

    public int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int takeDrink() {
        if (this.volume > 0) {
            this.volume -= 10;
        }
        return this.volume;
    }

    public int emptyBottle() {
        if (this.volume >0){
            this.volume = 0;
      }
      return this.volume;
    }

    public int fill() {
        if(this.volume <= 100){
            this.volume = 100;
        }
        return this.volume;
    }
}
