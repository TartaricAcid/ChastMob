package schr0.chastmob.init;

import schr0.chastmob.ChastMob;

public class ChastMobNBTTags
{

	private static final String TAG = ChastMob.MOD_ID + ".";
	private static final String CATEGORY_ENTITY = TAG + "entity" + ".";
	private static final String CATEGORY_ITEM = TAG + "item" + ".";

	private static final String ENTITY_CHAST = CATEGORY_ENTITY + "chast" + ".";
	public static final String CHAST_INVENTORY = ENTITY_CHAST + "inventory";
	public static final String CHAST_ARM_COLOR = ENTITY_CHAST + "arm_color";
	public static final String CHAST_OWNER_UUID = ENTITY_CHAST + "owner_uuid";
	public static final String CHAST_AI_MODE = ENTITY_CHAST + "ai_mode";
	public static final String CHAST_STATE_SIT = ENTITY_CHAST + "state_sit";

	private static final String ITEM_HOME_CHEST_MAP = CATEGORY_ITEM + "home_chest_map";
	public static final String HOME_CHEST_MAP_POS_X = ITEM_HOME_CHEST_MAP + "pos_x";
	public static final String HOME_CHEST_MAP_POS_Y = ITEM_HOME_CHEST_MAP + "pos_y";
	public static final String HOME_CHEST_MAP_POS_Z = ITEM_HOME_CHEST_MAP + "pos_z";

}