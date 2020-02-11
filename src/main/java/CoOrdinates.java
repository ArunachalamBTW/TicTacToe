public enum CoOrdinates {
    ONE(1),
    TWO(2),
    THREE(3);

    private int coOrdinateValue;

    CoOrdinates(int coOrdinateValue) {
        this.coOrdinateValue = coOrdinateValue;
    }

    public int getCoOrdinateValue() {
        return coOrdinateValue;
    }
}
