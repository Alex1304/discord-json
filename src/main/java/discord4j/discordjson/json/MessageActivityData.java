package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageActivityData.class)
@JsonDeserialize(as = ImmutableMessageActivityData.class)
public interface MessageActivityData {

    int type();

    @JsonProperty("party_id")
    default Possible<String> partyId() { return Possible.absent(); }
}
