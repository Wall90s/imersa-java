import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
public class StickersGenerator {

    public void create(InputStream inputStream, String archiveName) throws IOException {
        // Leitura da imagem
        // InputStream inputStream = new FileInputStream(new File("../input/movie.jpg"));
        // InputStream inputStream = new URL("https://imersao-java-apis.s3.amazonaws.com/TopMovies_1.jpg").openStream();
        BufferedImage originalImage = ImageIO.read(inputStream);

        // Cria nova imagem em memória com transparência
        int width = originalImage.getWidth();
        int height = originalImage.getTileHeight();
        int newHeigth = height + 200;
        BufferedImage newImage = new BufferedImage(width, newHeigth, BufferedImage.TRANSLUCENT);

        // Copiar a imagem original para nova imagem (em memória)
        Graphics2D graphics = (Graphics2D) newImage.getGraphics();
        graphics.drawImage(originalImage, 0, 0, null);

        // Configurar fonte
        var font = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics.setColor(Color.MAGENTA);
        graphics.setFont(font);

        // Escrever uma frase na nova imagem
        graphics.drawString("Maravitop", 100, newHeigth - 100);

        // Escrever a nova imagem em um arquivo
        ImageIO.write(newImage, "png", new File(archiveName));

    }

}
