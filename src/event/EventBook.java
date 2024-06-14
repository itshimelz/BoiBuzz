package event;

import java.awt.Component;
import model.BookModel;

public interface EventBook {

    public void itemClick(Component com, BookModel item);

}
