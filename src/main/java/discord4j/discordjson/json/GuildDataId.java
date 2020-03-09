package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildDataId.class)
@JsonDeserialize(as = ImmutableGuildDataId.class)
public interface GuildDataId {

    String id();
}
