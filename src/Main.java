import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder log = new StringBuilder();

        File srcDir = new File("D://Games//src");
        File resDir = new File("D://Games//res");
        File savegamesDir = new File("D://Games//savegames");
        File tempDir = new File("D://Games//temp");
        File mainDir = new File("D://Games//src//main");
        File testDir = new File("D://Games//src//test");
        File mainFile = new File("D://Games//src//main//Main.java");
        File utilsFile = new File("D://Games//src//main//Utils.java");
        File drawablesDir = new File("D://Games//res//drawables");
        File vectorsDir = new File("D://Games//res//vectors");
        File iconsDir = new File("D://Games//res//icons");

        if(srcDir.mkdir() == true) {
            log.append("Папка src создана.\n");
        } else log.append("Папка src не создана.\n");

        if(resDir.mkdir() == true) {
            log.append("Папка res создана.\n");
        } else log.append("Папка res не создана.\n");

        if(savegamesDir.mkdir() == true) {
            log.append("Папка savegames создана.\n");
        } else log.append("Папка savegames не создана.\n");

        if(tempDir.mkdir() == true) {
            log.append("Папка temp создана.\n");
        } else log.append("Папка temp не создана.\n");

        if(mainDir.mkdir() == true) {
            log.append("Папка main создана.\n");
        } else log.append("Папка main не создана.\n");

        if(testDir.mkdir() == true) {
            log.append("Папка test создана.\n");
        } else log.append("Папка test не создана.\n");

        try {
            if(mainFile.createNewFile())
                log.append("Файл Main успешно создан.\n");
        } catch (IIOException ex) {
            log.append(ex.getMessage());
        }

        try {
            if(utilsFile.createNewFile())
                log.append("Файл Utils успешно создан.\n");
        } catch (IIOException ex) {
            log.append(ex.getMessage());
        }

        if(drawablesDir.mkdir() == true) {
            log.append("Папка drawables создана.\n");
        } else log.append("Папка drawables не создана.\n");

        if(vectorsDir.mkdir() == true) {
            log.append("Папка vectors создана.\n");
        } else log.append("Папка vectors не создана.\n");

        if(iconsDir.mkdir() == true) {
            log.append("Папка icons создана.\n");
        } else log.append("Папка icons не создана.\n");

        try (FileWriter writer = new FileWriter("D://Games//temp//temp.txt", false)) {
            writer.write(log.toString());
            writer.flush();
        } catch (IIOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
