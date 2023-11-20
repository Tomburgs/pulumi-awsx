// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsx.ec2.outputs;

import com.pulumi.awsx.ec2.enums.SubnetType;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResolvedSubnetSpec {
    /**
     * @return An optional list of CIDR blocks to assign to the subnet spec for each AZ. If specified, the count must match the number of AZs being used for the VPC, and must also be specified for all other subnet specs.
     * 
     */
    private @Nullable List<String> cidrBlocks;
    /**
     * @return The netmask for the subnet&#39;s CIDR block. This is optional, the default value is inferred from the `cidrMask`, `cidrBlocks` or based on an even distribution of available space from the VPC&#39;s CIDR block after being divided evenly by availability zone.
     * 
     */
    private @Nullable Integer cidrMask;
    /**
     * @return The subnet&#39;s name. Will be templated upon creation.
     * 
     */
    private @Nullable String name;
    /**
     * @return Optional size of the subnet&#39;s CIDR block - the number of hosts. This value must be a power of 2 (e.g. 256, 512, 1024, etc.). This is optional, the default value is inferred from the `cidrMask`, `cidrBlocks` or based on an even distribution of available space from the VPC&#39;s CIDR block after being divided evenly by availability zone.
     * 
     */
    private @Nullable Integer size;
    /**
     * @return The type of subnet.
     * 
     */
    private SubnetType type;

    private ResolvedSubnetSpec() {}
    /**
     * @return An optional list of CIDR blocks to assign to the subnet spec for each AZ. If specified, the count must match the number of AZs being used for the VPC, and must also be specified for all other subnet specs.
     * 
     */
    public List<String> cidrBlocks() {
        return this.cidrBlocks == null ? List.of() : this.cidrBlocks;
    }
    /**
     * @return The netmask for the subnet&#39;s CIDR block. This is optional, the default value is inferred from the `cidrMask`, `cidrBlocks` or based on an even distribution of available space from the VPC&#39;s CIDR block after being divided evenly by availability zone.
     * 
     */
    public Optional<Integer> cidrMask() {
        return Optional.ofNullable(this.cidrMask);
    }
    /**
     * @return The subnet&#39;s name. Will be templated upon creation.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Optional size of the subnet&#39;s CIDR block - the number of hosts. This value must be a power of 2 (e.g. 256, 512, 1024, etc.). This is optional, the default value is inferred from the `cidrMask`, `cidrBlocks` or based on an even distribution of available space from the VPC&#39;s CIDR block after being divided evenly by availability zone.
     * 
     */
    public Optional<Integer> size() {
        return Optional.ofNullable(this.size);
    }
    /**
     * @return The type of subnet.
     * 
     */
    public SubnetType type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolvedSubnetSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> cidrBlocks;
        private @Nullable Integer cidrMask;
        private @Nullable String name;
        private @Nullable Integer size;
        private SubnetType type;
        public Builder() {}
        public Builder(ResolvedSubnetSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.cidrMask = defaults.cidrMask;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder cidrBlocks(@Nullable List<String> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }
        public Builder cidrBlocks(String... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }
        @CustomType.Setter
        public Builder cidrMask(@Nullable Integer cidrMask) {
            this.cidrMask = cidrMask;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder size(@Nullable Integer size) {
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder type(SubnetType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ResolvedSubnetSpec build() {
            final var o = new ResolvedSubnetSpec();
            o.cidrBlocks = cidrBlocks;
            o.cidrMask = cidrMask;
            o.name = name;
            o.size = size;
            o.type = type;
            return o;
        }
    }
}
