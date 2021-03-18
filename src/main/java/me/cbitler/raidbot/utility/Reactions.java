package me.cbitler.raidbot.utility;

import me.cbitler.raidbot.RaidBot;
import net.dv8tion.jda.core.entities.Emote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reactions {
    /**
     * List of reactions representing classes
     */
    static String[] specs = {
            "Summoner",
            "RedMage",
            "Warrior",
            "Monk",
            "WhiteMage",
            "Machinist",
            "Astrologian",
            "BlackMage",
            "Samurai",
            "Paladin",
            "Dragoon",
            "Ninja",
            "DarkKnight",
            "Bard",
            "Dancer",
            "Gunbreaker",
            "Scholar"

    };

    static Emote[] reactions = {
            
            getEmoji("622941097965912064"), //Paladin
            getEmoji("622941098003922954"), //Warrior
            getEmoji("622941097945071647"), //DarkKnight
            getEmoji("622941097748070423"), //Gunbreaker            
            getEmoji("622941097995403294"), //WhiteMage
            getEmoji("622941097559064579"), //Scholar
            getEmoji("622941097978494988"), //Astrologian            
            getEmoji("622941097999597588"), //Monk
            getEmoji("622941097961717770"), //Dragoon
            getEmoji("622941097949265920"), //Ninja
            getEmoji("622941097965912084"), //Samurai
            getEmoji("622941097945071626"), //Bard
            getEmoji("622941097991077902"), //Machinist
            getEmoji("622941097827500043"), //Dancer
            getEmoji("622941097966043155"), //BlackMage
            getEmoji("622941098121232388"), //Summoner
            getEmoji("622941098008117257") //RedMage
    };

    /**
     * Get an emoji from it's emote ID via JDA
     * @param id The ID of the emoji
     * @return The emote object representing that emoji
     */
    private static Emote getEmoji(String id) {
        return RaidBot.getInstance().getJda().getEmoteById(id);
    }

    /**
     * Get the list of reaction names as a list
     * @return The list of reactions as a list
     */
    public static List<String> getSpecs() {
        return new ArrayList<>(Arrays.asList(specs));
    }

    /**
     * Get the list of emote objects
     * @return The emotes
     */
    public static List<Emote> getEmotes() {
        return new ArrayList<>(Arrays.asList(reactions));
    }


}
