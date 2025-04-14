package enumDemo;

public enum Direction {
	NORTH {
		public String onCompass() {
			return "0 degrees";
		}
	},
	EAST {
		public String onCompass() {
			return "90 degrees clockwise";
		}
	},
	SOUTH {
		public String onCompass() {
			return "180 degrees clockwise";
		}
	},
	WEST {
		public String onCompass() {
			return "270 degrees clockwise";
		}
	};
	public abstract String onCompass();
}
