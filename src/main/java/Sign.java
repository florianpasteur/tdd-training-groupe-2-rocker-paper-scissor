public enum Sign {
    ROCK, SCISSOR, PAPER;

    public boolean beats(Sign player2sign) {
        if (this == ROCK && player2sign == PAPER)
            return  true;
        if (this == SCISSOR && player2sign == ROCK)
            return  true;
        if (this == PAPER && player2sign == SCISSOR)
            return  true;
        return false;
    }
}
