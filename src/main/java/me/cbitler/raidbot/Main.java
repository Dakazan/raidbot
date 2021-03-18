package me.cbitler.raidbot;

import me.cbitler.raidbot.handlers.DMHandler;
import me.cbitler.raidbot.utility.EnvVariables;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;
import java.io.*;

/**
 * Start the program, read the token, and start the bot
 * @author Christopher Bitler
 */
public class Main {
    public static void main(String[] args) throws LoginException, InterruptedException, RateLimitedException {
        String token = "TOKEN";
        JDA jda = new JDABuilder(AccountType.BOT).setToken(token).buildBlocking();
        RaidBot bot = new RaidBot(jda);
    }
}
