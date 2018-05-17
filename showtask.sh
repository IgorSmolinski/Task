#!/usr/bin/env bash



open_browser()
{
google-chrome http://localhost:8080/crud/v1/task/getTasks
}

end()
{
echo "Everything went good"
}

fail()
{
echo "Smth went wrong"
}

if ./runcrud.sh; then
open_browser
end
else
fail
fi
