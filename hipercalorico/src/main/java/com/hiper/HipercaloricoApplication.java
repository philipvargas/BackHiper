package com.hiper;

import com.hiper.model.Supplement;
import com.hiper.model.User;
import com.hiper.repository.crud.SupplementCrudRepository;
import com.hiper.repository.crud.UserCrudRepository;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HipercaloricoApplication implements CommandLineRunner {

    @Autowired
    private UserCrudRepository userRepo;

    @Autowired
    private SupplementCrudRepository supRepo;

    public static void main(String[] args) {
        SpringApplication.run(HipercaloricoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepo.deleteAll();
        supRepo.deleteAll();

        //para efectos de formateo de fechas
//        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//
//        userRepo.saveAll(
//                List.of(
//                        new User(1, "453423", "JUANA LA LOCA", "CL 34 NRO AAA..", "234123", "juanaloca@gmail.com", "Demo123.", "ZONA 1", "ADM"),
//                        new User(2, "3453423", "FELIPE EL HERMOSO", "CL 34 NRO AAA..", "234123", "felipeh@gmail.com", "Demo123.", "ZONA 1", "COORD"),
//                        new User(3, "253423", "ISABEL I", "CL 34 NRO AAA..", "234123", "isabelI@gmail.com", "Demo123.", "ZONA 1", "ASE"),
//                        new User(4, "34534423", "FERNANDO DE ARAGON", "CL 34 NRO AAA..", "234123", "ferchoviii@gmail.com", "Demo123.", "ZONA 1", "ASE")
//                )
//        );
//
//        supRepo.saveAll(
//                List.of(
//                        new Supplement("AP-903", "MARCA 1", "CATEGORIA 1", "OBJETIVO 1", "Descripción", true, 150000, 10, "https://www.avasoluciones.com/uploads/2021/09/910-006127.jpg"),
//                        new Supplement("AP-904", "MARCA 2", "CATEGORIA 2", "OBJETIVO 1", "Descripción", true, 150000, 10, "https://www.avasoluciones.com/uploads/2021/09/910-007.jpg")
//                )
//        );
//
//        System.out.println("Listado de Usuarios");
//        userRepo.findAll().forEach(System.out::println);
//
//        System.out.println("Listado de Splementos");
//        supRepo.findAll().forEach(System.out::println);
    }

}
