package academy.devdojo.springboot2.Service;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;
@Service
public class AnimeService {
    public static List<Anime> listAll(){
        return List.of(new Anime(1L,"dbz"),new Anime(2L,"Berseker"),new Anime(3L,"Toguro"));
    }
}
