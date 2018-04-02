
import java.util.List;
import java.util.Iterator;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.stream.Collectors;
import java.util.NoSuchElementException;

class Agenda
{
  private String filename = "agents.txt";
  List<String> list = new ArrayList<>();
  Iterator<String> iterator = null;

  public Agenda (){
    try (BufferedReader br = Files.newBufferedReader(Paths.get(filename))) {
  		//br returns as stream and convert it into a List
  		list = br.lines().collect(Collectors.toList());
      iterator = list.iterator();
  	} catch (IOException e) {
      e.printStackTrace();
  	}
  }

  public String read() throws NoSuchElementException
  {
    return iterator.next();
  }
}
