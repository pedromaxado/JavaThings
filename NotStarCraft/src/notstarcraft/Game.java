package notstarcraft;

import notstarcraft.NotStarCraft;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pedro
 */
public class Game {

    static final int WIDTH = 1280;
    static final int HEIGHT = 768;

    public Game() throws SlickException {
        AppGameContainer notstarcraft = new AppGameContainer(new NotStarCraft("Not Star Craft!", WIDTH, HEIGHT));
        notstarcraft.setDisplayMode(WIDTH, HEIGHT, false);
        notstarcraft.setTargetFrameRate(60);
        notstarcraft.setVSync(true);
        notstarcraft.start();
    }

}