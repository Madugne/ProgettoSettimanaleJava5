package chunyin.ProgettoSettimanale5.config;

import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

public class ServerConfig {
    @Bean
    public Cloudinary cloudinaryUploader(@Value("${cloudinary.name}") String name,
                                         @Value("${cloudinary.key}") String key,
                                         @Value("${cloudinary.secret}") String secret){
        Map<String, String> configuration = new HashMap<>();
        configuration.put("cloud_name",name);
        configuration.put("api_key",key);
        configuration.put("api_secret",secret);
        return new Cloudinary(configuration);
    }
}