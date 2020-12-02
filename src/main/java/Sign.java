public enum Sign {
    ROCK {
        @Override
        boolean isBeaten(Sign otherSign) {
            return otherSign == PAPER;
        }
    }, SCISSOR {
        @Override
        boolean isBeaten(Sign otherSign) {
            return otherSign == ROCK;
        }

    }, PAPER {
        @Override
        boolean isBeaten(Sign otherSign) {
            return otherSign == SCISSOR;
        }

    };

    abstract boolean isBeaten(Sign otherSign);
}
