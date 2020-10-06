package ge.edu.btu.calculator.service.impl;

import ge.edu.btu.calculator.Main;
import ge.edu.btu.calculator.service.CalculatorService;
import org.apache.log4j.Logger;

public class CalculatorServiceImpl implements CalculatorService {

    final static Logger logger=Logger.getLogger(CalculatorServiceImpl.class);
    @Override
    public int sum(int x, int y) {
        logger.info("info: " + x + " + " + y);
        return x + y;
    }

    @Override
    public double sum(double x, double y) {
        logger.info("info: " + x + " + " + y);
        return x + y;
    }

    @Override
    public double divide(int x, int y) {
        try{
            logger.info("info: " + x + " / " + y);
            return x/y;
        }catch (ArithmeticException e){
            logger.error("Error: " + e.getMessage());
            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public double divide(double x, double y) {
        try{
            logger.info("info: " + x + " / " + y);
            return x/y;
        }catch (ArithmeticException e){
            logger.error("Error: " + e.getMessage());
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
