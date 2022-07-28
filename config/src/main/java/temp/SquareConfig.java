package temp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SquareConfig {
    @Bean

    @ConditionalOnProperty(name = "square.enable", havingValue = "true", matchIfMissing = true)
    public Square getSquare() {
        return new Square();
    }
}
