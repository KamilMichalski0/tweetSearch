package michalski.kamil;

import michalski.kamil.config.PictureUploadProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({PictureUploadProperties.class})
public class TweetSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(TweetSearchApplication.class, args);
	}
}
