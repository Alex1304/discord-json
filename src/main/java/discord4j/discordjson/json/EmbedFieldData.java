package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableEmbedFieldData.class)
@JsonDeserialize(as = ImmutableEmbedFieldData.class)
public interface EmbedFieldData {

    String name();

    String value();

    default Possible<Boolean> inline() { return Possible.absent(); }
}
