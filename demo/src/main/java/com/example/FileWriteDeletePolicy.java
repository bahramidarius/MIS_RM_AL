package com.example;

/*import io.github.pack4j.annotation.Permission;
import io.github.pack4j.annotation.Policy;
*/
import java.io.FilePermission;
import java.security.Permissions;

@Policy
public class FileWriteDeletePolicy {

    @Permission
    public Permissions fileWriteDeletePermissions() {
        Permissions permissions = new Permissions();

        // Erlaube Schreiben und Löschen in diesem Verzeichnis
        String path = "/pfad/zum/verzeichnis/-"; // - steht für alle Dateien und Unterverzeichnisse

        permissions.add(new FilePermission(path, "write,delete"));

        return permissions;
    }
}

