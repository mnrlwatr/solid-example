package ocp.with;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Circle implements Shape {
    private Double radius;

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }


}
