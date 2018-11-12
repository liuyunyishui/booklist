package readinglist.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import readinglist.pojo.Reader;

/**
 * Created by ly on 2018/11/7.
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
