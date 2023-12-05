// Strategy 클래스 정의

public class Strategy {

  public static final int MEAN = 0;

  public static final int DISTRIBUTION = 1;

}

// CalcFactory 클래스 정의

public class CalcFactory {

  public Calculator getCalculator(int strategy) {

    switch (strategy) {

      case Strategy.MEAN:

        return new MeanCalculator();

      case Strategy.DISTRIBUTION:

        return new DistributeCalculator();

      default:

        throw new IllegalArgumentException("Invalid strategy");

    }

  }

}

// 메인 코드에서 두 전략을 사용하여 값을 구하는 예시

public class Main {

  public static void main(String[] args) {

    long[] arr = { 10, 20, 30, 55, 60, 75, 80, 95, 83, 50 };

    CalcFactory calcFactory = new CalcFactory();

    // MEAN 전략 사용

    Calculator meanCalculator = calcFactory.getCalculator(Strategy.MEAN);

    long meanResult = meanCalculator.calc(arr);

    System.out.println("Mean Result: " + meanResult);

    // DISTRIBUTION 전략 사용

    Calculator distributionCalculator = calcFactory.getCalculator(Strategy.DISTRIBUTION);

    long distributionResult = distributionCalculator.calc(arr);

    System.out.println("Distribution Result: " + distributionResult);

  }

}