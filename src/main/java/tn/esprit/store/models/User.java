package tn.esprit.store.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    Long id ;
    String f_name;
    String l_name;
    String number ;
    String address;
}
