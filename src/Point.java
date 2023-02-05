class Point {
    int x,y;
    Point(int x ,int y){
        this.x = x;
        this.y = y;
    }
    int getX() {
        return x;
    }
    int getY() {
        return y;
    }
    public String toString() {
        return  ("(" + x + "," + y + ")");
    }
}
