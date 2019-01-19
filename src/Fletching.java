
import java.awt.Graphics2D;

import org.osbot.rs07.api.Bank;
import org.osbot.rs07.api.model.RS2Object;
import org.osbot.rs07.script.Script;
import org.osbot.rs07.script.ScriptManifest;


@ScriptManifest(author = "Kevin", info = "script for fletching", name = "Fletcher", version = 0, logo = "")
public class Fletching extends Script {

    @Override
    public void onStart() {
        log("Let's get started!");
    }

    @Override
    public int onLoop() throws InterruptedException {
        Bank bank = getObjects().getBank();
        return random(200, 300);
    }

    @Override
    public void onExit() {
        log("Thanks for running my Tea Thiever!");
    }

    @Override
    public void onPaint(Graphics2D g) {

    }
}
