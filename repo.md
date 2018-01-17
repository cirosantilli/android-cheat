# repo

Useless Python wrapper for Git :-)

Mainly useless because it apparently only manages branching, but not fixing a specific version across all git repos it manages.

So you never have the concept of a specific state, unless you copy the SHA of all git repos inside. Lol.

Since cloning all the 600+ git repos takes hours, it may happen that the last one is out of sync with the first one.

So at the end it may be worth to do a second sync just to be sure, that one will be faster since just git pull.

## Why `.repo` is big?

Becomes huge after build, why?

## init

`init` fetches a git repo that contains a `manifest.xml`, e.g.:

    repo init https://android.googlesource.com/platform/manifest

Browse <https://android.googlesource.com/platform/manifest> to understand it.

The most interesting part of that file is:

    <default revision="refs/tags/android-8.1.0_r1"

which gives the branch on which it will fetch all the git repos.

TODO: how does `-b` find the revisions inside the git repos? I've checked and many of the subrepos don't have 

<https://stackoverflow.com/questions/15870217/android-source-code-and-repo-what-exactly-is-happening-when-getting-code>

## sync

`sync` does either:

- `git clone` the first time
- `git pull` the following ones

## checkout

Only works for branches, not tags?

AND those branches must exist exactly, e.g. `refs/remotes/aosp/sdk-release` does not include `sdk-release` as `git` would automatically recognize.

AND `repo checkout refs/remotes/aosp/sdk-release` fails anyways.

Especially confusing, since you can pass tags to `repo init -b tag`...

So, just use `repo forall checkout`?

But, not all repos have all tags... even recent ones... e.g. `oreo-mr1-release` is not present in `device/google/cuttlefish`. Oh, I give up on giving sanity to Android, it's just a ball of mess.
