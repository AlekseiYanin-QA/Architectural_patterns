package structural;

// Main класс для тестирования
public class Main {
    public static void main(String[] args) {
        Folder rootFolder = new Folder("Root");

        Folder documentsFolder = new Folder("Documents");
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        documentsFolder.addComponent(file1);
        documentsFolder.addComponent(file2);

        Folder picturesFolder = new Folder("Pictures");
        File image1 = new File("image1.jpg");
        File image2 = new File("image2.jpg");
        picturesFolder.addComponent(image1);
        picturesFolder.addComponent(image2);

        rootFolder.addComponent(documentsFolder);
        rootFolder.addComponent(picturesFolder);

        rootFolder.showDetails();
    }
}
