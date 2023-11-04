package controller;

import common.Validation;
import model.InputData;
import repository.FileRepository;
import view.Menu;

public class FileController extends Menu {

    protected static String[] mc = {"Count Word In file", "Find File By Word", "Exit"};
    protected FileRepository repo;
    protected InputData input;
    private static Validation valid = new Validation();

    public FileController() {
        super("========== Word program =========", mc);
        repo = new FileRepository();
        input = new InputData();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1: {
                System.out.println("---------- Count Word -----------");
                input.setPathname(valid.inputString("Enter path"));
                input.setWord(valid.inputString("Enter word"));
                repo.countWord(input);
                break;
            }
            case 2: {
                System.out.println("---------- Find File By Word -----------");
                input.setPathname(valid.inputString("Enter path"));
                input.setWord(valid.inputString("Enter word"));
                repo.findFileByWord(input);
                break;
            }
            case 3: {
                System.out.println("EXITED...");
                System.exit(0);
            }
            default: {
                System.out.println("No such choice");
            }
        }
    }
}