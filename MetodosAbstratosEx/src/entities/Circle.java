package entities;

public class Circle extends Shape {
    
    private Double radio;

    public Circle(){
    }

    public Circle(Double radio) {
        this.radio = radio;
    }

    public Circle(Color color, Double radio) {
        super(color);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

}
