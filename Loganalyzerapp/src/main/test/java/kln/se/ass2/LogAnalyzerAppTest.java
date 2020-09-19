package kln.se.ass2;

import kln.se.ass2.input.Input;
import kln.se.ass2.logfile.FirstReadLogFile;
import kln.se.ass2.logfile.MoreReadLogFile;
import kln.se.ass2.textcontent.Textfile;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.mockito.Mockito.*;

public class LogAnalyzerAppTest {

    Textfile textfilehandler = mock(Textfile.class);
    FirstReadLogFile firstReadLogFile = mock(FirstReadLogFile.class);
    MoreReadLogFile moreReadLogFile = mock(MoreReadLogFile.class);
    Input input = mock(Input.class);

    @Test
    public void should_getting_log_file_path() throws FileNotFoundException {

        when(input.readFilepath()).thenReturn("src\\main\\resources\\example.log");

       LogAnalyzerApp logAnalyzerApp = new LogAnalyzerApp(textfilehandler, firstReadLogFile, moreReadLogFile,input);

       logAnalyzerApp.show();
       verify(input).readFilepath();

    }

}