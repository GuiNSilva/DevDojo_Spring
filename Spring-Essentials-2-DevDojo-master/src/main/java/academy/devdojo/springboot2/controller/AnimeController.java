package academy.devdojo.springboot2.controller;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.util.DateUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("Anime")
@Log4j2
public class AnimeController {
    @Autowired
    private DateUtil dateUtil;

    @GetMapping(path ="list")

    public List<Anime>list(){
        log.info(dateUtil.formatLocalDateTimetoDatabaseStile(LocalDateTime.now()));

        return List.of(new Anime("dbz"),new Anime("Berseker"),new Anime("Toguro"));
    }
}
