package ocp.with;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Rectangle implements AreaCalculator {
    private Double length;
    private Double width;

    @Override
    public double calculateArea() {
        return length*width;
    }
}
