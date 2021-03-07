package hoofdstuk11.exercise2;

public class Tile {
    char letter;
    int value;

    public Tile(char letter, int value){
        this.letter = letter;
        this.value = value;
    }

    public char getLetter(){
        return this.letter;
    }
    public void setLetter(char letter){
        this.letter = letter;
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public void printTile(){
        System.out.printf("Letter: %c%nValue: %d", this.letter, this.value);
    }
    public boolean equals(Tile that){
      return this.letter == that.letter && this.value == that.value;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "letter=" + letter +
                ", value=" + value +
                '}';
    }
}
