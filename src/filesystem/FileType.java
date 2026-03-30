package filesystem;

public enum FileType {
    TXT("txt"),
    PDF("pdf"),
    JAVA("java");

    // field
    private final String extension;

    // Constructor
    private FileType(String extension){
        this.extension = extension;
    }

    // Getter method
    public String getExtension(){
        return extension;
    }
}




