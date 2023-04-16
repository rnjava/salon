package man.salon.api.model;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Component
public class Salon {

    @Value("${salon.name}")
    private String name;
    
    @Value("${salon.address}")
    private String address;
    
    @Value("${salon.city}")
    private String city;
    
    @Value("${salon.state}")
    private String state;
    
    @Value("${salon.zipcode}")
    private String zipcode;
    
    @Value("${salon.phone}")
    private String phone;
    
}
