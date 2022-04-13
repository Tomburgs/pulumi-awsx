// *** WARNING: this file was generated by pulumi-gen-awsx. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export * from "./provider";

// Export sub-modules:
import * as cloudtrail from "./cloudtrail";
import * as ecs from "./ecs";
import * as types from "./types";

export {
    cloudtrail,
    ecs,
    types,
};

import { Provider } from "./provider";

pulumi.runtime.registerResourcePackage("awsx", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:awsx") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
