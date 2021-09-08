package papka;

public class Line {
    private int start;
    private int finish;

    public Line(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

    public int getStart() {
        return start;
    }

    public int getFinish() {
        return finish;
    }

    public void isCrossed(Line line) {
        if(start <= line.getStart() && finish >= line.getFinish()){
            System.out.println("crossed");
        } else {
            System.out.println("not crossed");
        }
    }
}
