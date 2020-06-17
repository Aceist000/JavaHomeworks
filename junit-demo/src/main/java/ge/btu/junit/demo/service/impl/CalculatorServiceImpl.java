package ge.btu.junit.demo.service.impl;

import ge.btu.junit.demo.service.aspect.Println;
import org.springframework.stereotype.Service;
import ge.btu.junit.demo.service.impl.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Println
    @Override
    public int multiplication(int x, int y)
    {
        return x*y;
    }
}
