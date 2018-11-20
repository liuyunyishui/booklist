package readinglist.dao;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import readinglist.pojo.Book;


/**
 * Created by weichen on 2018/11/2.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader);
}
