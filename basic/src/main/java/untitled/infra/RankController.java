package untitled.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import untitled.domain.*;

@RestController
// @RequestMapping(value="/ranks")
@Transactional
public class RankController {

    @Autowired
    RankRepository rankRepository;

    @PutMapping("/ranks/search/findByName")
    public Object findByName(@RequestBody RankviewQuery query) {
        return rankRepository.findByName();
    }
}
