package example.log;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;


@Service
@Log4j2
public class LogService {

    public void log() {

        //1.
        log.info("LogController called! 1234567890");
        //2.
        log.debug("LogController called! 1234567890");
        //3.
        log.warn("LogController called! 1234567890");
        //4.
        log.error("LogController called! 1234567890");
    }
}
